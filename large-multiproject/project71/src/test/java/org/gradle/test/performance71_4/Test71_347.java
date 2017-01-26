package org.gradle.test.performance71_4;

import static org.junit.Assert.*;

public class Test71_347 {
    private final Production71_347 production = new Production71_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}