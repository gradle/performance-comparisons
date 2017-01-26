package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_255 {
    private final Production71_255 production = new Production71_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}