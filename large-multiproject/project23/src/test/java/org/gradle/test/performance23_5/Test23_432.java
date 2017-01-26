package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_432 {
    private final Production23_432 production = new Production23_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}