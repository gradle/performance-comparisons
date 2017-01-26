package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_49 {
    private final Production23_49 production = new Production23_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}