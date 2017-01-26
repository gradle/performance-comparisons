package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_27 {
    private final Production45_27 production = new Production45_27("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}