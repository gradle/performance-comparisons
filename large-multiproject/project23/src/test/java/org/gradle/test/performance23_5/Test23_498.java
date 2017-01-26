package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_498 {
    private final Production23_498 production = new Production23_498("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}