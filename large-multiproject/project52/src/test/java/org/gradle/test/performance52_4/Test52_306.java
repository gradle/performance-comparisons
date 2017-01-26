package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_306 {
    private final Production52_306 production = new Production52_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}