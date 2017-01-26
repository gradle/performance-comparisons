package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_347 {
    private final Production23_347 production = new Production23_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}