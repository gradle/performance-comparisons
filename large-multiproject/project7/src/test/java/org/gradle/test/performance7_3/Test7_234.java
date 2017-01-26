package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_234 {
    private final Production7_234 production = new Production7_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}