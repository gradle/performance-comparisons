package org.gradle.test.performance30_3;

import static org.junit.Assert.*;

public class Test30_234 {
    private final Production30_234 production = new Production30_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}