package org.gradle.test.performance52_1;

import static org.junit.Assert.*;

public class Test52_49 {
    private final Production52_49 production = new Production52_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}