package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_331 {
    private final Production71_331 production = new Production71_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}