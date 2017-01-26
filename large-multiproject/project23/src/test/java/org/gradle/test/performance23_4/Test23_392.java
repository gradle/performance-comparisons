package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_392 {
    private final Production23_392 production = new Production23_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}