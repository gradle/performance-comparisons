package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_234 {
    private final Production17_234 production = new Production17_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}