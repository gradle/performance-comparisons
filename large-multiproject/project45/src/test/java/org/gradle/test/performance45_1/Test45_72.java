package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_72 {
    private final Production45_72 production = new Production45_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}