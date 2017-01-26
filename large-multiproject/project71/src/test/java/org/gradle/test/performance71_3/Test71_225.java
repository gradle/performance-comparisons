package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_225 {
    private final Production71_225 production = new Production71_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}