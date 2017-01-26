package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_85 {
    private final Production23_85 production = new Production23_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}