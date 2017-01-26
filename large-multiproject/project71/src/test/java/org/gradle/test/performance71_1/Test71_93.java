package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_93 {
    private final Production71_93 production = new Production71_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}