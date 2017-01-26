package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_97 {
    private final Production52_97 production = new Production52_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}