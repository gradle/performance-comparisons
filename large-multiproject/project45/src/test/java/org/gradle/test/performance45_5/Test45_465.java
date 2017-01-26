package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_465 {
    private final Production45_465 production = new Production45_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}