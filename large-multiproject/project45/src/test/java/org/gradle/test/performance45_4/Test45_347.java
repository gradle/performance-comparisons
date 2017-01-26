package org.gradle.test.performance45_4;

import static org.junit.Assert.*;

public class Test45_347 {
    private final Production45_347 production = new Production45_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}