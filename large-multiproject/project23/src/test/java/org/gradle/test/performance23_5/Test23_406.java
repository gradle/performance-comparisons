package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_406 {
    private final Production23_406 production = new Production23_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}