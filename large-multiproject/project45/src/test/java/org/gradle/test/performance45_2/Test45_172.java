package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_172 {
    private final Production45_172 production = new Production45_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}