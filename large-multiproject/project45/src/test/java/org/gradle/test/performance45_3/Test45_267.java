package org.gradle.test.performance45_3;

import static org.junit.Assert.*;

public class Test45_267 {
    private final Production45_267 production = new Production45_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}