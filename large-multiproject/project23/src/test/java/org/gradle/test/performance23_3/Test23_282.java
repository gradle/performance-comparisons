package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_282 {
    private final Production23_282 production = new Production23_282("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}