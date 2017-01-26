package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_40 {
    private final Production23_40 production = new Production23_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}