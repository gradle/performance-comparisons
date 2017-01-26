package org.gradle.test.performance71_3;

import static org.junit.Assert.*;

public class Test71_212 {
    private final Production71_212 production = new Production71_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}