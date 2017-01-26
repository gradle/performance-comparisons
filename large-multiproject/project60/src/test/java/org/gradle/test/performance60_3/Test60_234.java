package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_234 {
    private final Production60_234 production = new Production60_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}