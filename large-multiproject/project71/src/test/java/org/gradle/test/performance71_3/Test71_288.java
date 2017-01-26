package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_288 {
    private final Production71_288 production = new Production71_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}