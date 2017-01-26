package org.gradle.test.performance65_4;

import static org.junit.Assert.*;

public class Test65_320 {
    private final Production65_320 production = new Production65_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}