package org.gradle.test.performance52_3;

import static org.junit.Assert.*;

public class Test52_267 {
    private final Production52_267 production = new Production52_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}