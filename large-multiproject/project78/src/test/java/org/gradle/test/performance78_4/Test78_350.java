package org.gradle.test.performance78_4;

import static org.junit.Assert.*;

public class Test78_350 {
    private final Production78_350 production = new Production78_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}