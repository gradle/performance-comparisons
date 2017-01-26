package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_406 {
    private final Production71_406 production = new Production71_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}