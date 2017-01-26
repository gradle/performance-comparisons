package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_264 {
    private final Production52_264 production = new Production52_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}