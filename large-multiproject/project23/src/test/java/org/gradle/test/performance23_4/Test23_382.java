package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_382 {
    private final Production23_382 production = new Production23_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}