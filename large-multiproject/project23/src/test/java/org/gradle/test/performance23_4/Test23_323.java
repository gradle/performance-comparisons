package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_323 {
    private final Production23_323 production = new Production23_323("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}