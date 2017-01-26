package org.gradle.test.performance45_1;

import static org.junit.Assert.*;

public class Test45_77 {
    private final Production45_77 production = new Production45_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}