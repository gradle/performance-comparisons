package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_445 {
    private final Production52_445 production = new Production52_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}