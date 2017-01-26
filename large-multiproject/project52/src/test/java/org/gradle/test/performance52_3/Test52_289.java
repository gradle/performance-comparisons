package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_289 {
    private final Production52_289 production = new Production52_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}