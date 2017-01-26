package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_111 {
    private final Production78_111 production = new Production78_111("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}