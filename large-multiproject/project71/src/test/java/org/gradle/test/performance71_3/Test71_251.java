package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_251 {
    private final Production71_251 production = new Production71_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}