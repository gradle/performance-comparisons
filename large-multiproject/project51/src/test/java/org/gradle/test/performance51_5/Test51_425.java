package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_425 {
    private final Production51_425 production = new Production51_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}