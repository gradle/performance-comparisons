package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_338 {
    private final Production23_338 production = new Production23_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}