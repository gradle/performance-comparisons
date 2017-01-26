package org.gradle.test.performance52_4;

import static org.junit.Assert.*;

public class Test52_338 {
    private final Production52_338 production = new Production52_338("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}