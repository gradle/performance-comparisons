package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_75 {
    private final Production23_75 production = new Production23_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}