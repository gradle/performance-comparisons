package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_445 {
    private final Production71_445 production = new Production71_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}