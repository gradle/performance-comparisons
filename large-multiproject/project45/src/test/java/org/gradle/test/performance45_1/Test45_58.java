package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_58 {
    private final Production45_58 production = new Production45_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}