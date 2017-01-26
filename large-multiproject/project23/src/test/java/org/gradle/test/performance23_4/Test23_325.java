package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_325 {
    private final Production23_325 production = new Production23_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}