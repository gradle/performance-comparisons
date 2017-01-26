package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_425 {
    private final Production52_425 production = new Production52_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}