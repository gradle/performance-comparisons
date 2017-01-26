package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_445 {
    private final Production45_445 production = new Production45_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}