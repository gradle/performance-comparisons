package org.gradle.test.performance61_1;

import static org.junit.Assert.*;

public class Test61_85 {
    private final Production61_85 production = new Production61_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}