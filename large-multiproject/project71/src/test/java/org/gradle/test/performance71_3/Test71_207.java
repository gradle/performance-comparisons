package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_207 {
    private final Production71_207 production = new Production71_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}