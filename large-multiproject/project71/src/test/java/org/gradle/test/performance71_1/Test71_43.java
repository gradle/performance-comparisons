package org.gradle.test.performance71_1;

import static org.junit.Assert.*;

public class Test71_43 {
    private final Production71_43 production = new Production71_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}