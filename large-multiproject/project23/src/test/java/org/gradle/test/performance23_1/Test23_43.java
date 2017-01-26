package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_43 {
    private final Production23_43 production = new Production23_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}