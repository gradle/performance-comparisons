package org.gradle.test.performance45_2;

import static org.junit.Assert.*;

public class Test45_107 {
    private final Production45_107 production = new Production45_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}