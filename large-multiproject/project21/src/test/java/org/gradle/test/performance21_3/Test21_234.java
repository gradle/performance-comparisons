package org.gradle.test.performance21_3;

import static org.junit.Assert.*;

public class Test21_234 {
    private final Production21_234 production = new Production21_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}