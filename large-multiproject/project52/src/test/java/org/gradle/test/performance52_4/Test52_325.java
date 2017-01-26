package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_325 {
    private final Production52_325 production = new Production52_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}