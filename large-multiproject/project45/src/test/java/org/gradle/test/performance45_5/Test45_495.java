package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_495 {
    private final Production45_495 production = new Production45_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}